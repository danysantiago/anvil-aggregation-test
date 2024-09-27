package org.dany.libOne

import com.squareup.anvil.annotations.ContributesTo
import dagger.Provides
import dagger.Module
import dagger.multibindings.IntoSet
import org.dany.scope.AppScope

@Module
@ContributesTo(AppScope::class)
object LibraryOneContribution {
    @Provides
    @IntoSet
    fun lib(): String = "LibraryOne"
}