package com.soywiz.korge.view.filter

import assertEqualsFloat
import com.soywiz.korge.view.*
import com.soywiz.korma.geom.*
import kotlin.test.*

class DirectionalBlurFilterTest {
    @Test
    fun test() {
        val blur = DirectionalBlurFilter(radius = 4.0)
        val solidRect = SolidRect(200, 100).filters(blur)
        assertEqualsFloat(Rectangle(0, 0, 200, 100), solidRect.getBounds(includeFilters = false))
        assertEqualsFloat(Rectangle(-14, 0, 228, 100), solidRect.getBounds(includeFilters = true))
    }
}