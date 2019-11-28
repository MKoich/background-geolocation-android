package com.marianhello.bgloc.data;

import com.marianhello.bgloc.Config;
import org.json.JSONException;

public interface ConfigurationDAO {
    boolean persistConfiguration(Config config) throws NullPointerException;
    Config retrieveConfiguration() throws JSONException;
}
