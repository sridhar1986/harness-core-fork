/*
 * Copyright 2022 Harness Inc. All rights reserved.
 * Use of this source code is governed by the PolyForm Free Trial 1.0.0 license
 * that can be found in the licenses directory at the root of this repository, also available at
 * https://polyformproject.org/wp-content/uploads/2020/05/PolyForm-Free-Trial-1.0.0.txt.
 */

package io.harness.beans.event.cg;

import static io.harness.annotations.dev.HarnessTeam.CDC;

import io.harness.annotations.dev.OwnedBy;
import io.harness.beans.CreatedByType;
import io.harness.beans.EmbeddedUser;
import io.harness.beans.event.EventPayloadData;
import io.harness.beans.event.cg.application.ApplicationEventData;
import io.harness.beans.event.cg.entities.EnvironmentEntity;
import io.harness.beans.event.cg.entities.InfraDefinitionEntity;
import io.harness.beans.event.cg.entities.ServiceEntity;
import io.harness.beans.event.cg.pipeline.ExecutionArgsEventData;
import io.harness.beans.event.cg.pipeline.PipelineEventData;
import io.harness.beans.event.cg.pipeline.PipelineExecData;
import io.harness.beans.event.cg.workflow.WorkflowEventData;
import io.harness.beans.event.cg.workflow.WorkflowExecData;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@OwnedBy(CDC)
@NoArgsConstructor
@AllArgsConstructor
public abstract class CgWorkflowExecutionPayload extends EventPayloadData {
  private ApplicationEventData application;
  private WorkflowEventData workflow;
  private PipelineEventData pipeline;
  private ExecutionArgsEventData executionArgs;
  private EmbeddedUser triggeredBy;
  private CreatedByType triggeredByType;
  private long startedAt;
  private List<ServiceEntity> services;
  private List<EnvironmentEntity> environments;
  private List<InfraDefinitionEntity> infraDefinitions;
  private WorkflowExecData workflowExecution;
  private PipelineExecData pipelineExecution;

  @Override
  public String getWorkflowId() {
    return workflow.getId();
  }
}
