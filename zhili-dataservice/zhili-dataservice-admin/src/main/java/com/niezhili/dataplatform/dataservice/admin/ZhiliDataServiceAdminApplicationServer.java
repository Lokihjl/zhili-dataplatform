/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.niezhili.dataplatform.dataservice.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author niezhili
 * @date 2021-05-23
 */
@SpringBootApplication
@ServletComponentScan
@ComponentScan(value = "com.niezhili.dataplatform.dataservice",
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.apache.dolphinscheduler.server.*"))
public class ZhiliDataServiceAdminApplicationServer extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ZhiliDataServiceAdminApplicationServer.class, args);
    }

}
