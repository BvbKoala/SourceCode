/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.v4.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;

class ConfigurationHelperGingerbread {

    static int getScreenHeightDp(@NonNull Resources resources) {
        final DisplayMetrics metrics = resources.getDisplayMetrics();
        return (int) (metrics.heightPixels / metrics.density);
    }

    static int getScreenWidthDp(@NonNull Resources resources) {
        final DisplayMetrics metrics = resources.getDisplayMetrics();
        return (int) (metrics.widthPixels / metrics.density);
    }

    static int getSmallestScreenWidthDp(@NonNull Resources resources) {
        // Not perfect, but close enough
        return Math.min(getScreenWidthDp(resources), getScreenHeightDp(resources));
    }

    static int getDensityDpi(@NonNull Resources resources) {
        return resources.getDisplayMetrics().densityDpi;
    }
}
