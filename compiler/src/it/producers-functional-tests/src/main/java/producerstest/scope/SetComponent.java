/*
 * Copyright (C) 2016 The Dagger Authors.
 *
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

package producerstest.scope;

import com.google.common.util.concurrent.ListenableFuture;
import dagger.producers.ProductionComponent;
import java.util.Set;
import producerstest.ExecutorModule;

@ProductionComponent(modules = {ExecutorModule.class, ScopedModule.class, SetProducerModule.class})
interface SetComponent {
  ScopedObject scopedObject();

  ListenableFuture<Set<Object>> set();
}
