/*
 * Copyright 2009 Gist, Inc.
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

package com.gist.twitter;

import java.util.Collection;

/**
 * Fetches filter parameters to pass to twitter when creating the stream.
 *
 * @author <a href="mailto:tom@gist.com">Tom May</a>
 */
public interface FilterParameterFetcher {
    /**
     * @return a collection of twitter ids to follow, or null for no
     *   id filtering.
     */
    Collection<String> getFollowIds();

    /**
     * @return a collection of keywords to track, or null for no
     *   keyword filtering.
     */
    Collection<String> getTrackKeywords();
}
