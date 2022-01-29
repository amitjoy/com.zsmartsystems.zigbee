/**
 * Copyright (c) 2016-2022 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.xbee.internal.protocol;

import com.zsmartsystems.zigbee.security.ZigBeeKey;

/**
 * Class to implement the XBee command <b>Set Link Key</b>.
 * <p>
 * AT Command <b>KY</b></p>Sets the 128-bit AES link key value that the device uses for
 * encryption and decryption. This command is write-only and cannot be read. If you set KY to 0
 * the coordinator transmits the network key in the clear to joining devices, and joining
 * devices acquire the network key in the clear when joining.
 * <p>
 * This class provides methods for processing XBee API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class XBeeSetLinkKeyCommand extends XBeeFrame implements XBeeCommand {
    /**
     */
    private Integer frameId;

    /**
     */
    private ZigBeeKey linkKey;

    /**
     *
     * @param frameId the frameId to set as {@link Integer}
     */
    public void setFrameId(Integer frameId) {
        this.frameId = frameId;
    }

    /**
     *
     * @param linkKey the linkKey to set as {@link ZigBeeKey}
     */
    public void setLinkKey(ZigBeeKey linkKey) {
        this.linkKey = linkKey;
    }

    @Override
    public int[] serialize() {
        // Serialize the command fields
        serializeCommand(0x08);
        serializeInt8(frameId);
        serializeAtCommand("KY");
        serializeZigBeeKey(linkKey);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(381);
        // First present the command parameters...
        // Then the responses later if they are available
        builder.append("XBeeSetLinkKeyCommand [frameId=");
        builder.append(frameId);
        builder.append(", linkKey=");
        builder.append(linkKey);
        builder.append(']');
        return builder.toString();
    }
}
