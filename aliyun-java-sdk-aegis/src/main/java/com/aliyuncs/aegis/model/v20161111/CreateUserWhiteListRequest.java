/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateUserWhiteListRequest extends RpcAcsRequest<CreateUserWhiteListResponse> {
	
	public CreateUserWhiteListRequest() {
		super("aegis", "2016-11-11", "CreateUserWhiteList", "vipaegis");
	}

	private String riskIdList;

	private String reason;

	private String sourceIp;

	public String getRiskIdList() {
		return this.riskIdList;
	}

	public void setRiskIdList(String riskIdList) {
		this.riskIdList = riskIdList;
		if(riskIdList != null){
			putQueryParameter("RiskIdList", riskIdList);
		}
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	@Override
	public Class<CreateUserWhiteListResponse> getResponseClass() {
		return CreateUserWhiteListResponse.class;
	}

}
