//
//  SceneDelegate.swift
//  dnykIOS
//
//  Created by John Patrick Teruel on 5/28/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import UIKit

class SceneDelegate: UIResponder, UIWindowSceneDelegate {
    var window: UIWindow?
    
    private lazy var appCoordinator: AppCoordinator = {
        return AppCoordinator(window: window!)
    }()
    
    func scene(_ scene: UIScene, willConnectTo session: UISceneSession, options connectionOptions: UIScene.ConnectionOptions) {
        guard let windowScene  = (scene as? UIWindowScene) else { return }
        let window = UIWindow(windowScene: windowScene)
        self.window = window
        appCoordinator.start()
    }
}
