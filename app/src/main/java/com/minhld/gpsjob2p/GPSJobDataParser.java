package com.minhld.gpsjob2p;

import com.minhld.job2p.jobs.JobDataParser;

/**
 * GPS data parser
 *
 * Created by minhld on 1/21/2015.
 */
public class GPSJobDataParser implements JobDataParser {

    @Override
    public Class getDataClass() {
        return String.class;
    }

    @Override
    public Object readFile(String path) throws Exception {
        return "";
    }

    @Override
    public Object parseBytesToObject(byte[] byteData) throws Exception {
        return new String(byteData);
    }

    @Override
    public byte[] parseObjectToBytes(Object objData) throws Exception {
        String dataStr = (String) objData;
        return dataStr.getBytes();
    }

    @Override
    public Object getSinglePart(Object data, int numOfParts, int index) {
        return "";
    }

    @Override
    public String getJsonMetadata(Object objData) {
        return "";
    }

    @Override
    public Object createPlaceholder(String jsonMetadata) {
        return "";
    }

    @Override
    public Object copyPartToPlaceholder(Object placeholderObj, byte[] partObj, int index) {
        return new String(partObj);
    }

    @Override
    public void destroy(Object data) {
        data = null;
    }

    @Override
    public boolean isObjectDestroyed(Object data) {
        return true;
    }
}
