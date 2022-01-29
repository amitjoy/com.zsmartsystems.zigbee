/**
 * Copyright (c) 2016-2022 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.dongle.xbee.internal.protocol;


/**
 * Class to implement the XBee command <b>Set Encryption Enable</b>.
 * <p>
 * AT Command <b>EE</b></p>Set or read the encryption enable setting.
 * <p>
 * This class provides methods for processing XBee API commands.
 * <p>
 * Note that this code is autogenerated. Manual changes may be overwritten.
 *
 * @author Chris Jackson - Initial contribution of Java code generator
 */
public class XBeeSetEncryptionEnableCommand extends XBeeFrame implements XBeeCommand {
    /**
     */
    private Integer frameId;

    /**
     */
    private Boolean enableEncryption;

    /**
     *
     * @param frameId the frameId to set as {@link Integer}
     */
    public void setFrameId(Integer frameId) {
        this.frameId = frameId;
    }

    /**
     *
     * @param enableEncryption the enableEncryption to set as {@link Boolean}
     */
    public void setEnableEncryption(Boolean enableEncryption) {
        this.enableEncryption = enableEncryption;
    }

    @Override
    public int[] serialize() {
        // Serialize the command fields
        serializeCommand(0x08);
        serializeInt8(frameId);
        serializeAtCommand("EE");
        serializeBoolean(enableEncryption);

        return getPayload();
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(390);
        // First present the command parameters...
        // Then the responses later if they are available
        builder.append("XBeeSetEncryptionEnableCommand [frameId=");
        builder.append(frameId);
        builder.append(", enableEncryption=");
        builder.append(enableEncryption);
        builder.append(']');
        return builder.toString();
    }
}
