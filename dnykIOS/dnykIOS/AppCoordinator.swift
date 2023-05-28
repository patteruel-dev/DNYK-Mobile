//
//  AppCoordinator.swift
//  dnykIOS
//
//  Created by John Patrick Teruel on 5/28/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import AuthFeatureKit

class AppCoordinator {
    private let window: UIWindow
    
    private lazy var authKit: AuthKit = AuthKit()
    
    init(window: UIWindow) {
        self.window = window
    }
    
    func start() {
        authKit.startLoginFlow(window: window)
    }
}

