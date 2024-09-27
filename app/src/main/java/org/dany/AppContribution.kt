package org.dany

import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet
import org.dany.scope.AppScope

@Module
@ContributesTo(AppScope::class)
object AppContribution {
    @Provides
    @IntoSet
    fun app(): String = "App"
}