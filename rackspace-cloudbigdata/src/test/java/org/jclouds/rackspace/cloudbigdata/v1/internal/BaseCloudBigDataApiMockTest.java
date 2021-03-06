/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.rackspace.cloudbigdata.v1.internal;

import static org.jclouds.openstack.keystone.v2_0.config.KeystoneProperties.CREDENTIAL_TYPE;
import static org.jclouds.openstack.keystone.v2_0.config.KeystoneProperties.SERVICE_TYPE;

import java.util.Properties;

import org.jclouds.openstack.keystone.v2_0.config.CredentialTypes;
import org.jclouds.openstack.v2_0.internal.BaseOpenStackMockTest;
import org.jclouds.rackspace.cloudbigdata.v1.CloudBigDataApi;
import org.jclouds.rackspace.cloudidentity.v2_0.ServiceType;

/**
 * Base class for writing Cloud Big Data Expect tests
 */
public class BaseCloudBigDataApiMockTest extends BaseOpenStackMockTest<CloudBigDataApi> {
   protected Properties overrides;
   /**
    * Base Mock Test
    */
   public BaseCloudBigDataApiMockTest() {
      overrides = new Properties();
      overrides.setProperty(CREDENTIAL_TYPE, CredentialTypes.PASSWORD_CREDENTIALS);
      overrides.setProperty(SERVICE_TYPE, ServiceType.BIG_DATA);
   }
}
