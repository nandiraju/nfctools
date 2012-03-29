package org.nfctools.llcp.pdu;

public class PduConstants {

	public static final int PDU_SYMMETRY = 0x00;
	public static final int PDU_PARAMETER_EXCHANGE = 0x01;
	public static final int PDU_AGGREGATED_FRAME = 0x02;
	public static final int PDU_UNNUMBERED_INFORMATION = 0x03;
	public static final int PDU_CONNECT = 0x04;
	public static final int PDU_DISCONNECT = 0x05;
	public static final int PDU_CONNECT_COMPLETE = 0x06;
	public static final int PDU_DISCONNECTED_MODE = 0x07;
	public static final int PDU_FRAME_REJECT = 0x08;
	public static final int PDU_RFU_1 = 0x09;
	public static final int PDU_RFU_2 = 0x0A;
	public static final int PDU_RFU_3 = 0x0B;
	public static final int PDU_INFORMATION = 0x0C;
	public static final int PDU_RECEIVE_READY = 0x0D;
	public static final int PDU_RECEIVE_NOT_READY = 0x0E;
	public static final int PDU_RFU_4 = 0x0F;

	public static final int PARAM_VERSION = 0x01;
	public static final int PARAM_MIUX = 0x02;
	public static final int PARAM_WKS = 0x03;
	public static final int PARAM_LTO = 0x04;
	public static final int PARAM_RW = 0x05;
	public static final int PARAM_SN = 0x06;
	public static final int PARAM_OPT = 0x07;

}
