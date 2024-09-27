package org.dany

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.test.assertEquals

@RunWith(AndroidJUnit4::class)
class MultibindingAggregationTest {
    @Test
    fun useAppContext() {
        val multibindingSet = DaggerAppComponent.create().getMultibinding()
        assertEquals(
            expected = setOf("App", "LibraryOne", "LibraryTwo"),
            actual = multibindingSet
        )
    }
}