/*
 * Copyright 2022 Readium Foundation. All rights reserved.
 * Use of this source code is governed by the BSD-style license
 * available in the top-level LICENSE file of the project.
 */

package org.readium.r2.navigator.media3.exoplayer

import org.readium.r2.navigator.preferences.Configurable
import org.readium.r2.shared.ExperimentalReadiumApi

/**
 * Settings values of the ExoPlayer engine.
 *
 * @see ExoPlayerPreferences
 */
@ExperimentalReadiumApi
data class ExoPlayerSettings(
    val pitch: Double,
    val speed: Double
) : Configurable.Settings
