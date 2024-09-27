## Anvil Aggregation Test

This small project reproduces an 'issue' (TBD) in Anvil, where aggregation can be lost between
dependencies boundaries if they are declared as `implementation` in Gradle due to reduced compile
classpath.

To check run: `./gradlew :app:connectedDebugAndroidTest` and observe test failure:
```
expected:<[App, LibraryOne, LibraryTwo]> but was:<[App, LibraryOne]
```

The test `MultibindingAggregationTest` is trying to validate that multibinding contributions
are aggregated at the component even if they come from a 2nd level transitive dependency. However,
since `libraryTwo` is not in the compile classpath of `app` the hints created by Anvil are lost
and the module ends up being missing from the component.

Note that this `main` branch validate the KSP version of Anvil (`dev.zacsweers.anvil`) while the
branch `kapt-anvil` validates the KAPT version (`com.squareup.anvil`).