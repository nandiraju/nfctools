package org.nfctools.spi.acs;

import java.io.IOException;

import javax.smartcardio.CardChannel;

import org.nfctools.io.NfcDevice;
import org.nfctools.mf.MfAccess;

public class Acr128ReaderWriter extends AcsReaderWriter {

	public static final String TERMINAL_NAME = "ACS ACR128U PICC Interface";

	public Acr128ReaderWriter(NfcDevice nfcDevice) {
		super(nfcDevice);
		if (!cardTerminal.getName().contains(TERMINAL_NAME))
			throw new IllegalArgumentException("card terminal not supported");
	}

	@Override
	protected void loginIntoSector(MfAccess mfAccess, CardChannel cardChannel) throws IOException {
		super.loginIntoSector(mfAccess, cardChannel, Acs.P2_SESSION_KEY);
	}

}
