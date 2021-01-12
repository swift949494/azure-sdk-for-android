// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.serde.jackson;

import com.azure.core.serde.JsonFlatten;
import com.azure.core.serde.SerdeSubTypes;
import com.azure.core.serde.SerdeTypeInfo;
import com.azure.core.serde.SerdeTypeName;

@JsonFlatten
@SerdeTypeInfo(use = SerdeTypeInfo.Id.NAME,
    include = SerdeTypeInfo.As.PROPERTY,
    property = "@odata\\.type",
    defaultImpl = AnimalWithTypeIdContainingDot.class)
@SerdeTypeName("AnimalWithTypeIdContainingDot")
@SerdeSubTypes({
    @SerdeSubTypes.Type(name = "#Favourite.Pet.DogWithTypeIdContainingDot",
        value = DogWithTypeIdContainingDot.class),
    @SerdeSubTypes.Type(name = "#Favourite.Pet.CatWithTypeIdContainingDot",
        value = CatWithTypeIdContainingDot.class),
    @SerdeSubTypes.Type(name = "#Favourite.Pet.RabbitWithTypeIdContainingDot",
        value = RabbitWithTypeIdContainingDot.class)
})
public class AnimalWithTypeIdContainingDot {
}