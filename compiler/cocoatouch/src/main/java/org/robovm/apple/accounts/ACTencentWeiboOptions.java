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
package org.robovm.apple.accounts;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Accounts")/*</annotations>*/
@Marshaler(/*<name>*/ACTencentWeiboOptions/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ACTencentWeiboOptions/*</name>*/ 
    extends /*<extends>*/NSDictionaryWrapper/*</extends>*/
    /*<implements>*//*</implements>*/ {

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static ACTencentWeiboOptions toObject(Class<ACTencentWeiboOptions> cls, long handle, long flags) {
            NSDictionary o = (NSDictionary) NSObject.Marshaler.toObject(NSDictionary.class, handle, flags);
            if (o == null) {
                return null;
            }
            return new ACTencentWeiboOptions(o);
        }
        @MarshalsPointer
        public static long toNative(ACTencentWeiboOptions o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.data, flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<ACTencentWeiboOptions> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSDictionary> o = (NSArray<NSDictionary>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<ACTencentWeiboOptions> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(new ACTencentWeiboOptions(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<ACTencentWeiboOptions> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSDictionary> array = new NSMutableArray<>();
            for (ACTencentWeiboOptions i : l) {
                array.add(i.getDictionary());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constructors>*/
    ACTencentWeiboOptions(NSDictionary data) {
        super(data);
    }
    public ACTencentWeiboOptions() {}
    /*</constructors>*/

    /*<methods>*/
    public boolean has(NSString key) {
        return data.containsKey(key);
    }
    public NSObject get(NSString key) {
        if (has(key)) {
            return data.get(key);
        }
        return null;
    }
    public ACTencentWeiboOptions set(NSString key, NSObject value) {
        data.put(key, value);
        return this;
    }
    

    /**
     * @deprecated Deprecated in iOS 11.0. Use Tencent Weibo SDK instead
     */
    @Deprecated
    public String getAppId() {
        if (has(Keys.AppId())) {
            NSString val = (NSString) get(Keys.AppId());
            return val.toString();
        }
        return null;
    }
    /**
     * @deprecated Deprecated in iOS 11.0. Use Tencent Weibo SDK instead
     */
    @Deprecated
    public ACTencentWeiboOptions setAppId(String appId) {
        set(Keys.AppId(), new NSString(appId));
        return this;
    }
    /*</methods>*/
    
    /*<keys>*/
    @Library("Accounts")
    public static class Keys {
        static { Bro.bind(Keys.class); }
        /**
         * @deprecated Deprecated in iOS 11.0. Use Tencent Weibo SDK instead
         */
        @Deprecated
        @GlobalValue(symbol="ACTencentWeiboAppIdKey", optional=true)
        public static native NSString AppId();
    }
    /*</keys>*/
}
