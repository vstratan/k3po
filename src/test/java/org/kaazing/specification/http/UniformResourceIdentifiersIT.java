/**
 * Copyright (c) 2007-2014 Kaazing Corporation. All rights reserved.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.kaazing.specification.http;

import org.junit.Test;

/**
 * rfc7230#section-2.7
 *
 */
public class UniformResourceIdentifiersIT {

	@Test
	public void clientMustSendHostIdentifier() {

	}

	@Test
	public void upstreamMustRejectMissingHostIdentifier() {
		// 400 Bad Request
	}

	@Test
	public void upstreamMustRejectInvalidHostIdentifier() {
		// 400 Bad Request
	}

	@Test
	public void upstreamMustRejectRequestWithUserInfoOnURI() {
		// ex http://localhost:8000@username:password
	}

	@Test
	public void upstreamShouldAllowPercentCharsInURI() {
		// equivalent %chars to normal chars ?
	}

}
