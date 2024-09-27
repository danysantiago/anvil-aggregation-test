package org.dany

import com.squareup.anvil.annotations.ContributesTo
import com.squareup.anvil.annotations.MergeComponent
import dagger.Module
import dagger.multibindings.Multibinds
import org.dany.scope.AppScope

@MergeComponent(AppScope::class)
interface AppComponent {
    fun getMultibinding(): Set<String>
}

@Module
@ContributesTo(AppScope::class)
interface MultibindingModule {
    @Multibinds
    fun multibinding(): Set<String>
}
