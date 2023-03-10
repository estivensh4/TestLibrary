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

package com.estivensh4.jacoco;

/**
 * Holds the coverage observations for a single scope and coverage type.
 */
public final class CoverageCounter {
    private final int covered;
    private final int missed;

    CoverageCounter(int covered, int missed) {
        this.covered = covered;
        this.missed = missed;
    }

    public int getCovered() {
        return covered;
    }

    public int getMissed() {
        return missed;
    }

    @Override
    public String toString() {
        return String.format("Covered: %d, Missed: %d", covered, missed);
    }
}
