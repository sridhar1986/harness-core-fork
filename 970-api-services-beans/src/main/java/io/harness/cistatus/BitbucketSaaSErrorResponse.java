/*
 * Copyright 2023 Harness Inc. All rights reserved.
 * Use of this source code is governed by the PolyForm Free Trial 1.0.0 license
 * that can be found in the licenses directory at the root of this repository, also available at
 * https://polyformproject.org/wp-content/uploads/2020/05/PolyForm-Free-Trial-1.0.0.txt.
 */

package io.harness.cistatus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BitbucketSaaSErrorResponse {
  @JsonProperty("type") public String type;
  @JsonProperty("error") public Error error;

  @Data
  @JsonIgnoreProperties(ignoreUnknown = true)
  public static class Error {
    @JsonProperty("message") public String message;
  }
}
