/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2014, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.standard.inline;

/*
 *
 * @author Daniel Fernandez
 * @since 3.0.0
 * 
 */
final class StandardInlineUtils {



    static boolean mightNeedInlining(final CharSequence text) {

        int i = 0;
        final int maxi = text.length();

        char c;
        while (i < maxi) {

            c = text.charAt(i++);
            if (c == '[' && i < maxi) {
                final char c1 = text.charAt(i);
                if (c1 == '[' || c1 == '(') {
                    return true;
                }
            }

        }

        return false;

    }



    private StandardInlineUtils() {
        super();
    }


}