/*
 Copyright 2009 AdMob, Inc.
 
    Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 
  http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/

package com.adwhirl.util;

public class AdWhirlUtil {
	/*
	public static final String urlConfig = "http://adwhirllb-473732162.us-east-1.elb.amazonaws.com/getInfo.php?appid=%s&appver=%d&client=2";
	public static final String urlImpression = "http://adwhirllb-473732162.us-east-1.elb.amazonaws.com/exmet.php?appid=%s&nid=%s&type=%d&appver=%d&client=2";
	public static final String urlClick = "http://adwhirllb-473732162.us-east-1.elb.amazonaws.com/exclick.php?appid=%s&nid=%s&type=%d&appver=%d&client=2";
	public static final String urlCustom = "http://adwhirllb-473732162.us-east-1.elb.amazonaws.com/custom.php?appid=%s&nid=%s&appver=%d&client=2";
	*/
	
	public static final String urlConfig = "http://67.202.57.140/getInfo.php?appid=%s&appver=%d&client=2";
	public static final String urlImpression = "http://67.202.57.140/exmet.php?appid=%s&nid=%s&type=%d&appver=%d&client=2";
	public static final String urlClick = "http://67.202.57.140/exclick.php?appid=%s&nid=%s&type=%d&appver=%d&client=2";
	public static final String urlCustom = "http://67.202.57.140/custom.php?appid=%s&nid=%s&appver=%d&client=2";
	
	public static String keyAdWhirl;
	
	// Don't change anything below this line
	/***********************************************/ 
	
	public static final int VERSION = 200;

	public static final String ADWHIRL = "AdWhirl SDK";
	
	// Could be an enum, but this gives us a slight performance improvement
	public static final int NETWORK_TYPE_ADMOB = 1;
	public static final int NETWORK_TYPE_JUMPTAP = 2;
	public static final int NETWORK_TYPE_VIDEOEGG = 3;
	public static final int NETWORK_TYPE_MEDIALETS = 4;
	public static final int NETWORK_TYPE_LIVERAIL = 5;
	public static final int NETWORK_TYPE_MILLENIAL = 6;
	public static final int NETWORK_TYPE_GREYSTRIP = 7;
	public static final int NETWORK_TYPE_QUATTRO = 8;
	public static final int NETWORK_TYPE_CUSTOM = 9;
	public static final int NETWORK_TYPE_ADWHIRL = 10;
	public static final int NETWORK_TYPE_MOBCLIX = 11;
	public static final int NETWORK_TYPE_MDOTM = 12;
	public static final int NETWORK_TYPE_4THSCREEN = 13;
	public static final int NETWORK_TYPE_ADSENSE = 14;
	public static final int NETWORK_TYPE_DOUBLECLICK = 15;
	public static final int NETWORK_TYPE_GENERIC = 16;
	public static final int NETWORK_TYPE_EVENT = 17;
	
	public static final int CUSTOM_TYPE_BANNER = 1;
	public static final int CUSTOM_TYPE_ICON = 2;
}
