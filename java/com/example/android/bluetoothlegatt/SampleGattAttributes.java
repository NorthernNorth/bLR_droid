/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    //public static String HEART_RATE_MEASUREMENT = "e95d9250-251d-470a-a062-fa1922dfa9a8";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";

    static {
        // Sample Services.
        attributes.put("e95d6100-251d-470a-a062-fa1922dfa9a8", "Temperature Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        attributes.put("e95d0753-251d-470a-a062-fa1922dfa9a8", "Accelerometer Service");
        attributes.put("e95df2d8-251d-470a-a062-fa1922dfa9a8", "Magnetometer Service");
        attributes.put("e95d9882-251d-470a-a062-fa1922dfa9a8", "Button Service");
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Generic Access Service");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute Service");
        attributes.put("e95d127b-251d-470a-a062-fa1922dfa9a8", "IO PIN Service");
        attributes.put("e95dd91d-251d-470a-a062-fa1922dfa9a8", "LED Service");
        attributes.put("e95d93af-251d-470a-a062-fa1922dfa9a8", "Event Service");
        attributes.put("e95d93b0-251d-470a-a062-fa1922dfa9a8", "DFU Service");
        attributes.put("6e400001-b5a3-f393-e0a9-e50e24dcca9e", "UART Service");


        // Sample Characteristics.
        attributes.put("e95d9250-251d-470a-a062-fa1922dfa9a8", "Temperature Data");
        attributes.put("e95d1b25-251d-470a-a062-fa1922dfa9a8", "Temperature Period");
        attributes.put("00002a24-0000-1000-8000-00805f9b34fb", "Device Model");
        attributes.put("00002a25-0000-1000-8000-00805f9b34fb", "Serial Number");
        attributes.put("00002a26-0000-1000-8000-00805f9b34fb", "Firmware Revision");
        attributes.put("00002a27-0000-1000-8000-00805f9b34fb", "Hardware Revision");
        attributes.put("00002a28-0000-1000-8000-00805f9b34fb", "Software Revision");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("e95dca4b-251d-470a-a062-fa1922dfa9a8", "Accelerometer Data");
        attributes.put("e95dfb24-251d-470a-a062-fa1922dfa9a8", "Accelerometer Period");
        attributes.put("e95dfb11-251d-470a-a062-fa1922dfa9a8", "Magnetometer Data");
        attributes.put("e95d386c-251d-470a-a062-fa1922dfa9a8", "Magnetometer Period");
        attributes.put("e95d9715-251d-470a-a062-fa1922dfa9a8", "Magnetometer Bearing");
        attributes.put("e95dda90-251d-470a-a062-fa1922dfa9a8", "Button A");
        attributes.put("e95dda91-251d-470a-a062-fa1922dfa9a8", "Button B");
        attributes.put("00002a00-0000-1000-8000-00805f9b34fb", "Device Name");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb", "Appearance");
        attributes.put("00002a04-0000-1000-8000-00805f9b34fb", "Peripheral preferred connection parameters");
        attributes.put("00002a05-0000-1000-8000-00805f9b34fb", "Service changed");
        attributes.put("e95d8d00-251d-470a-a062-fa1922dfa9a8", "Pin data");
        attributes.put("e95d5899-251d-470a-a062-fa1922dfa9a8", "Pin AD config");
        attributes.put("e95db9fe-251d-470a-a062-fa1922dfa9a8", "Pin IO config");
        attributes.put("e95dd822-251d-470a-a062-fa1922dfa9a8", "PWM control");
        attributes.put("e95d7b77-251d-470a-a062-fa1922dfa9a8", "LED matix state");
        attributes.put("e95d93ee-251d-470a-a062-fa1922dfa9a8", "LED text");
        attributes.put("e95d0d2d-251d-470a-a062-fa1922dfa9a8", "Scrolling display");
        attributes.put("e95db84c-251d-470a-a062-fa1922dfa9a8", "Microbit requirement");
        attributes.put("e95d9775-251d-470a-a062-fa1922dfa9a8", "Microbit event");
        attributes.put("e95d23c4-251d-470a-a062-fa1922dfa9a8", "Client requirement");
        attributes.put("e95d5404-251d-470a-a062-fa1922dfa9a8", "Client event");
        attributes.put("e95d93b1-251d-470a-a062-fa1922dfa9a8", "DFU control");
        attributes.put("6e400002-b5a3-f393-e0a9-e50e24dcca9e", "Tx characteristic");
        attributes.put("6e400003-b5a3-f393-e0a9-e50e24dcca9e", "Rx characteristic");
    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
