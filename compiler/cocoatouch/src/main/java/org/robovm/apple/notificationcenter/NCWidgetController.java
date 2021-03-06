/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.notificationcenter;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @deprecated Deprecated in iOS 14.0. Use WidgetKit instead. Today View extensions have been deprecated.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NotificationCenter") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NCWidgetController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NCWidgetControllerPtr extends Ptr<NCWidgetController, NCWidgetControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NCWidgetController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NCWidgetController() {}
    protected NCWidgetController(Handle h, long handle) { super(h, handle); }
    protected NCWidgetController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setHasContent:forWidgetWithBundleIdentifier:")
    public native void setHasContentForWidgetWithBundleID(boolean flag, String bundleID);
    /*</methods>*/
}
