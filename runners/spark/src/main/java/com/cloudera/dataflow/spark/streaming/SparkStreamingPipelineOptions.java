/*
 * Copyright (c) 2015, Cloudera, Inc. All Rights Reserved.
 *
 * Cloudera, Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"). You may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for
 * the specific language governing permissions and limitations under the
 * License.
 */
package com.cloudera.dataflow.spark.streaming;

import com.google.cloud.dataflow.sdk.options.Default;
import com.google.cloud.dataflow.sdk.options.Description;

import com.cloudera.dataflow.spark.SparkPipelineOptions;

/**
 * Options used to configure Spark streaming.
 */
public interface SparkStreamingPipelineOptions extends SparkPipelineOptions {
  @Description("Timeout to wait (in msec) for the streaming execution so stop, -1 runs until " +
          "execution is stopped")
  @Default.Long(-1)
  Long getTimeout();

  void setTimeout(Long batchInterval);

  @Override
  @Default.Boolean(true)
  boolean isStreaming();

  @Override
  @Default.String("spark streaming dataflow pipeline job")
  String getAppName();
}
