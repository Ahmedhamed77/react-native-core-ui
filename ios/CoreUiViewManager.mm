#import <React/RCTViewManager.h>
#import <React/RCTUIManager.h>
#import "RCTBridge.h"

@interface CoreUiViewManager : RCTViewManager
@end

@implementation CoreUiViewManager

RCT_EXPORT_MODULE(CoreUiView)

- (UIView *)view
{
  return [[UIView alloc] init];
}

RCT_EXPORT_VIEW_PROPERTY(color, NSString)

@end
