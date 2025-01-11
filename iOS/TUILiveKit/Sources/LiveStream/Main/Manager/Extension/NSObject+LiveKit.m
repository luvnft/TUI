//
//  NSObject+LiveKit.m
//  TUIRoomKit
//
//  Created by Wizard of Hahz on 2024/25/12.
//  Copyright © 2023 Tencent. All rights reserved.
//

#import "NSObject+LiveKit.h"

@implementation NSObject (LiveKit)
#pragma clang diagnostic push
#pragma clang diagnostic ignored "-Wundeclared-selector"
+ (void) load {
    if ([self respondsToSelector:@selector(liveKitExtensionLoad)]) {
        [self performSelector:@selector(liveKitExtensionLoad)];
    }
}
#pragma clang diagnostic pop
@end
