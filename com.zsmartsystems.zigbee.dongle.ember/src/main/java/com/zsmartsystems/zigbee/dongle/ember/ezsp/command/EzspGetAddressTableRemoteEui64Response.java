/**
 * Copyright (c) 2016-2022 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.ember.ezsp.command;

import com.zsmartsystems.zigbee.IeeeAddress;
import com.zsmartsystems.zigbee.dongle.ember.ezsp.EzspFrameResponse;

/**
 * Class to implement the Ember EZSP command <b>getAddressTableRemoteEui64</b>.
 * <p>
 * Gets the EUI64 of an address table entry.
 * <p>
 * This class provides methods for processing EZSP commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class EzspGetAddressTableRemoteEui64Response extends EzspFrameResponse {
    public static final int FRAME_ID = 0x5E;

    /**
     * The EUI64 of the address table entry is copied to this location.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     */
    private IeeeAddress eui64;

    /**
     * Response and Handler constructor
     */
    public EzspGetAddressTableRemoteEui64Response(int[] inputBuffer) {
        // Super creates deserializer and reads header fields
        super(inputBuffer);

        // Deserialize the fields
        eui64 = deserializer.deserializeEmberEui64();
    }

    /**
     * The EUI64 of the address table entry is copied to this location.
     * <p>
     * EZSP type is <i>EmberEUI64</i> - Java type is {@link IeeeAddress}
     *
     * @return the current eui64 as {@link IeeeAddress}
     */
    public IeeeAddress getEui64() {
        return eui64;
    }

    /**
     * The EUI64 of the address table entry is copied to this location.
     *
     * @param eui64 the eui64 to set as {@link IeeeAddress}
     */
    public void setEui64(IeeeAddress eui64) {
        this.eui64 = eui64;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(91);
        builder.append("EzspGetAddressTableRemoteEui64Response [networkId=");
        builder.append(networkId);
        builder.append(", eui64=");
        builder.append(eui64);
        builder.append(']');
        return builder.toString();
    }
}
