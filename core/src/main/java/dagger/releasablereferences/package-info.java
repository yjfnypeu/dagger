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

/**
 * This package contains the API by which Dagger allows you
 * <a href="http://google.github.io/dagger/users-guide.html#releasable-references">release
 * references</a> held within some scopes.
 * 
 * <p><b>Note:</b>Releasable references uses Java's {@link java.lang.ref.WeakReference}, and so is
 * not compatible with <a href="http://www.gwtproject.org/">GWT</a>.
 *
 * @since 2.8
 */

package dagger.releasablereferences;
