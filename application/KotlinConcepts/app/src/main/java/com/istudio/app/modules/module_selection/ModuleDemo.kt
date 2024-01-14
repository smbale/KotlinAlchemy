package com.istudio.app.modules.module_selection
sealed class ModuleDemo(val rout: String) {

    data object DemoSelection : ModuleDemo("DemoSelection")
    data object KotlinBasicsDemo : ModuleDemo("KotlinBasicsDemo")
    data object SealedClassDemo : ModuleDemo("SealedClassDemo")
    data object HigherOrderFunctions : ModuleDemo("HigherOrderFunctions")
    data object AnnotationsInKotlin : ModuleDemo("AnnotationsInKotlin")
    data object TypeAlias : ModuleDemo("TypeAlias")
    data object ChannelsDemo : ModuleDemo("ChannelsDemo")
    data object FlowsSelection : ModuleDemo("FlowsSelection")
    data object FlowBasics : ModuleDemo("FlowBasics")
    data object DisplayDataFromServer : ModuleDemo("DisplayDataFromServer")
    data object TerminalOperators : ModuleDemo("TerminalOperators")
    data object IntermediateOperators : ModuleDemo("IntermediateOperators")
    data object NestedVsInner : ModuleDemo("NestedVsInner")
    data object CoroutinesDemo : ModuleDemo("CoroutinesDemo")
    data object Exercises : ModuleDemo("Exercises")
    data object Exercise1 : ModuleDemo("Exercise1")
    data object Exercise2 : ModuleDemo("Exercise2")
    data object SimpleStructuredConcurrencyDemo : ModuleDemo("SimpleStructuredConcurrencyDemo")
    data object DispatchersDemo : ModuleDemo("DispatchersDemo")
    data object CoroutinesCancellationSelection : ModuleDemo("CoroutinesCancellationSelection")
    data object RootChildrenCancelDemo : ModuleDemo("RootChildrenCancelDemo")
    data object CoroutinesCancellationIsActiveDemo : ModuleDemo("CoroutinesCancellationIsActiveDemo")
    data object EnsureActiveDemo : ModuleDemo("EnsureActiveDemo")

}