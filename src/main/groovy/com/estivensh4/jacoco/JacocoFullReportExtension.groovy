/*
 * Copyright 2015 Palantir Technologies, Inc.
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

package com.estivensh4.jacoco

public class JacocoFullReportExtension {

    public List<String> excludeProjects = new ArrayList<>()

    /**
     * Adds the given projects to the list of projects that should not be included in the coverage report.
     */
    def excludeProject(String... projects) {
        excludeProjects.addAll(projects)
    }
}
