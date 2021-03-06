/*
 * Copyright 2020 The gRPC Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.grpc.xds.internal.cel;

import java.lang.String;
import java.util.List;

/**
 * Default implementation of {@link Dispatcher}.
 * 
 * <p>This is a Java stub for evaluating Common Expression Language (CEL). 
 * More information about CEL can be found in https://github.com/google/cel-spec. 
 * Once Java CEL has been open-sourced, this stub will be removed.
 */
public class DefaultDispatcher implements Dispatcher {
  /** Creates a new dispatcher with all standard functions. */
  public static DefaultDispatcher create() {
    return new DefaultDispatcher();
  }

  @Override
  public Object dispatch(Metadata metadata, long exprId, 
      String functionName, List<String> overloadIds, Object[] args) 
      throws InterpreterException {
    return new Object();
  }
}
