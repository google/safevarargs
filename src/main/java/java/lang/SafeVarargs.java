/*
 * Copyright (C) 2013 Google, Inc.
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
package java.lang;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * A Java language annotation used by code that intends to signal the
 * SafeVarargs feature in later virtual machines, while remaining
 * compatible with prior versions. This should be used on the
 * boot-strap classpath at compile-time, and NOT included as a
 * transitive dependency at runtime, as it will be provided by the
 * target environment, if the feature is available. If the feature is
 * not available, the annotation (and its lack of presence on the
 * classpath) will be ignored, per the Java language spec.
 */
@Documented
@Retention(RUNTIME)
@Target({ CONSTRUCTOR, METHOD })
public @interface SafeVarargs {
}