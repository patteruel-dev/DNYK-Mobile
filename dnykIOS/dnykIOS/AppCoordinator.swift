//
//  AppCoordinator.swift
//  dnykIOS
//
//  Created by John Patrick Teruel on 5/28/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import AuthFeatureKit
import dnykCommon

class AppCoordinator {
    private let window: UIWindow
    private lazy var masterNavigation = UINavigationController()
    
    private lazy var dnykCommon: DNYKCommon = DNYKCommon()
    private lazy var authKit: AuthKit = AuthKit(dnykCommon: dnykCommon)
    
    init(window: UIWindow) {
        self.window = window
    }
    
    func start() {
        displayStartup()
        dnykCommon.setup()
        Task {
            do {
                // delay for 1 second
                try await Task.sleep(nanoseconds: 3 * 1_000_000_000)
                let isAuthorized = try await dnykCommon.authService.isAuthorized() == true
                await MainActor.run {
                    if isAuthorized {
                        // TODO: display main flow
                        print("display main flow")
                    } else {
                        authKit.startLoginFlow(navigationController: masterNavigation)
                    }
                }
            } catch {
                // TODO: display error
                await masterNavigation.present(UIAlertController(title: "Error", message: error.localizedDescription, preferredStyle: .alert), animated: true, completion: nil)
            
            }
        }
    }
    
    private func displayStartup() {
        let storyboard = UIStoryboard(name: "Startup", bundle: nil)
        masterNavigation.setViewControllers([
            storyboard.instantiateInitialViewController()!
        ], animated: false)
        window.rootViewController = masterNavigation
        window.makeKeyAndVisible()
    }
}

