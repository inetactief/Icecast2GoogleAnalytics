/*     Copyright 2017 SWI Kommunikations- und Computer GmbH
*
*        Licensed under the Apache License, Version 2.0 (the "License");
*        you may not use this file except in compliance with the License.
*        You may obtain a copy of the License at
*
*        http://www.apache.org/licenses/LICENSE-2.0
*
*        Unless required by applicable law or agreed to in writing, software
*       distributed under the License is distributed on an "AS IS" BASIS,
*        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*        See the License for the specific language governing permissions and
*        limitations under the License.
*/

package com.coherentreceiver.analytics.helper.idgenerator;

/**
 *
 */
public class IDGeneratorFactory  {

    public static IDGenerator getIDGenerator (String algorithm) throws Exception{
        if (algorithm.compareTo("icecast_id") ==0) return new IDGeneratorIcecastID();
        if (algorithm.compareTo("anonymized_ip") ==0) return new IDGeneratorAnonymizedIP();
        if (algorithm.compareTo("ip")==0) return new IDGeneratorIP();

        throw new Exception("unsupported ID generation method: available options are: anonymizedIP, IcecastId, ip");

    }
}
