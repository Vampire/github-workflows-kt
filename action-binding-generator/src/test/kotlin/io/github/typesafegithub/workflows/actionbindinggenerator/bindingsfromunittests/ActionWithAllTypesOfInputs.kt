// This file was generated using action-binding-generator. Don't change it by hand, otherwise your
// changes will be overwritten with the next binding code regeneration.
// See https://github.com/typesafegithub/github-workflows-kt for more info.
@file:Suppress(
    "DataClassPrivateConstructor",
    "UNUSED_PARAMETER",
)

package io.github.typesafegithub.workflows.actions.johnsmith

import io.github.typesafegithub.workflows.domain.actions.Action
import io.github.typesafegithub.workflows.domain.actions.RegularAction
import java.util.LinkedHashMap
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.toList
import kotlin.collections.toTypedArray

/**
 * Action: Do something cool
 *
 * This is a test description that should be put in the KDoc comment for a class
 *
 * [Action on GitHub](https://github.com/john-smith/action-with-all-types-of-inputs)
 *
 * @param fooBar Short description
 * @param bazGoo First boolean input!
 * @param binKin Boolean and nullable
 * @param intPint Integer
 * @param floPint Float
 * @param finBin Enumeration
 * @param gooZen Integer with special value
 * @param bahEnum Enum with custom naming
 * @param listStrings List of strings
 * @param listInts List of integers
 * @param listEnums List of enums
 * @param listIntSpecial List of integer with special values
 * @param _customInputs Type-unsafe map where you can put any inputs that are not yet supported by
 * the binding
 * @param _customVersion Allows overriding action's version, for example to use a specific minor
 * version, or a newer version that the binding doesn't yet know about
 */
public data class ActionWithAllTypesOfInputs private constructor(
    /**
     * Short description
     */
    public val fooBar: String,
    /**
     * First boolean input!
     */
    public val bazGoo: Boolean,
    /**
     * Boolean and nullable
     */
    public val binKin: Boolean? = null,
    /**
     * Integer
     */
    public val intPint: Int,
    /**
     * Float
     */
    public val floPint: Float,
    /**
     * Enumeration
     */
    public val finBin: ActionWithAllTypesOfInputs.Bin,
    /**
     * Integer with special value
     */
    public val gooZen: ActionWithAllTypesOfInputs.Zen,
    /**
     * Enum with custom naming
     */
    public val bahEnum: ActionWithAllTypesOfInputs.BahEnum,
    /**
     * List of strings
     */
    public val listStrings: List<String>? = null,
    /**
     * List of integers
     */
    public val listInts: List<Int>? = null,
    /**
     * List of enums
     */
    public val listEnums: List<ActionWithAllTypesOfInputs.MyEnum>? = null,
    /**
     * List of integer with special values
     */
    public val listIntSpecial: List<ActionWithAllTypesOfInputs.MyInt>? = null,
    /**
     * Type-unsafe map where you can put any inputs that are not yet supported by the binding
     */
    public val _customInputs: Map<String, String> = mapOf(),
    /**
     * Allows overriding action's version, for example to use a specific minor version, or a newer
     * version that the binding doesn't yet know about
     */
    public val _customVersion: String? = null,
) : RegularAction<ActionWithAllTypesOfInputs.Outputs>("john-smith",
        "action-with-all-types-of-inputs", _customVersion ?: "v3") {
    public constructor(
        vararg pleaseUseNamedArguments: Unit,
        fooBar: String,
        bazGoo: Boolean,
        binKin: Boolean? = null,
        intPint: Int,
        floPint: Float,
        finBin: ActionWithAllTypesOfInputs.Bin,
        gooZen: ActionWithAllTypesOfInputs.Zen,
        bahEnum: ActionWithAllTypesOfInputs.BahEnum,
        listStrings: List<String>? = null,
        listInts: List<Int>? = null,
        listEnums: List<ActionWithAllTypesOfInputs.MyEnum>? = null,
        listIntSpecial: List<ActionWithAllTypesOfInputs.MyInt>? = null,
        _customInputs: Map<String, String> = mapOf(),
        _customVersion: String? = null,
    ) : this(fooBar=fooBar, bazGoo=bazGoo, binKin=binKin, intPint=intPint, floPint=floPint,
            finBin=finBin, gooZen=gooZen, bahEnum=bahEnum, listStrings=listStrings,
            listInts=listInts, listEnums=listEnums, listIntSpecial=listIntSpecial,
            _customInputs=_customInputs, _customVersion=_customVersion)

    @Suppress("SpreadOperator")
    override fun toYamlArguments(): LinkedHashMap<String, String> = linkedMapOf(
        *listOfNotNull(
            "foo-bar" to fooBar,
            "baz-goo" to bazGoo.toString(),
            binKin?.let { "bin-kin" to it.toString() },
            "int-pint" to intPint.toString(),
            "flo-pint" to floPint.toString(),
            "fin-bin" to finBin.stringValue,
            "goo-zen" to gooZen.integerValue.toString(),
            "bah-enum" to bahEnum.stringValue,
            listStrings?.let { "list-strings" to it.joinToString(",") },
            listInts?.let { "list-ints" to it.joinToString(",") { it.toString() } },
            listEnums?.let { "list-enums" to it.joinToString(",") { it.stringValue } },
            listIntSpecial?.let { "list-int-special" to it.joinToString(",") {
                    it.integerValue.toString() } },
            *_customInputs.toList().toTypedArray(),
        ).toTypedArray()
    )

    override fun buildOutputObject(stepId: String): Outputs = Outputs(stepId)

    public sealed class Bin(
        public val stringValue: String,
    ) {
        public object Foo : ActionWithAllTypesOfInputs.Bin("foo")

        public object BooBar : ActionWithAllTypesOfInputs.Bin("boo-bar")

        public object Baz123 : ActionWithAllTypesOfInputs.Bin("baz123")

        public class Custom(
            customStringValue: String,
        ) : ActionWithAllTypesOfInputs.Bin(customStringValue)
    }

    public sealed class Zen(
        public val integerValue: Int,
    ) {
        public class Value(
            requestedValue: Int,
        ) : ActionWithAllTypesOfInputs.Zen(requestedValue)

        public object Special1 : ActionWithAllTypesOfInputs.Zen(3)

        public object Special2 : ActionWithAllTypesOfInputs.Zen(-1)
    }

    public sealed class BahEnum(
        public val stringValue: String,
    ) {
        public object HelloWorld : ActionWithAllTypesOfInputs.BahEnum("helloworld")

        public class Custom(
            customStringValue: String,
        ) : ActionWithAllTypesOfInputs.BahEnum(customStringValue)
    }

    public sealed class MyEnum(
        public val stringValue: String,
    ) {
        public object One : ActionWithAllTypesOfInputs.MyEnum("one")

        public object Two : ActionWithAllTypesOfInputs.MyEnum("two")

        public object Three : ActionWithAllTypesOfInputs.MyEnum("three")

        public class Custom(
            customStringValue: String,
        ) : ActionWithAllTypesOfInputs.MyEnum(customStringValue)
    }

    public sealed class MyInt(
        public val integerValue: Int,
    ) {
        public class Value(
            requestedValue: Int,
        ) : ActionWithAllTypesOfInputs.MyInt(requestedValue)

        public object TheAnswer : ActionWithAllTypesOfInputs.MyInt(42)
    }

    public class Outputs(
        stepId: String,
    ) : Action.Outputs(stepId) {
        /**
         * Cool output!
         */
        public val bazGoo: String = "steps.$stepId.outputs.baz-goo"
    }
}
