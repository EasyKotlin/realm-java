package io.realm.entities;
/*
 * Copyright 2017 Realm Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import io.realm.MutableRealmInteger;
import io.realm.RealmObject;


public class MutableRealmIntegerTypes extends RealmObject {
    public static final String CLASS_NAME = "MutableRealmIntegerTypes";
    public static final String FIELD_REALMINTEGER = "columnMutableRealmInteger";

    public final MutableRealmInteger columnMutableRealmInteger = MutableRealmInteger.ofNull();

    public MutableRealmInteger getColumnMutableRealmInteger() {
        return columnMutableRealmInteger;
    }
}
