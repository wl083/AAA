package com.example.administrator.aaa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivityF extends AppCompatActivity {

    String TAG="lei";
    private String str = "{\"RETURN_CODE\":\"00\",\"RETURN_MSG\":\"操作成功\",\"RESULT\":{\"examPie\":[{\"result\":\"中\",\"minScore\":\"\",\"cn\":4,\"maxScore\":\"\"},{\"result\":\"优\",\"minScore\":\"\",\"cn\":10,\"maxScore\":\"\"},{\"result\":\"差\",\"minScore\":\"\",\"cn\":1,\"maxScore\":\"\"},{\"result\":\"良\",\"minScore\":\"\",\"cn\":2,\"maxScore\":\"\"}],\"examResult\":{\"stuCode\":\"STD143331895270632\",\"createTime\":\"2016-03-19 14:09:51\",\"result\":\"良\",\"tchNote\":\"再接再厉\",\"examCode\":\"EM1458367791074S\",\"lastResult\":\"差\",\"examTime\":\"2016-03-18 14:09:06\",\"examName\":\"月考\",\"isHaveLast\":\"Y\"}}}";
    private String str2 = "{\"RETURN_CODE\":\"00\",\"RETURN_MSG\":\"操作成功\",\"RESULT\":{\"examPie\":[],\"examResult\":{}}}";
    private String str1 = "{\"RETURN_CODE\":\"00\",\"RETURN_MSG\":\"操作成功\"," +
            "\"RESULT\":{\"examPie\":[]," +
            "\"examResult\":{\"stuCode\":\"STD143331895270632\",\"createTime\":\"2016-03-19 14:09:51\"," +
            "\"result\":\"良\",\"tchNote\":\"再接再厉\",\"examCode\":\"EM1458367791074S\"," +
            "\"lastResult\":\"差\",\"examTime\":\"2016-03-18 14:09:06\",\"examName\":\"月考\"," +
            "\"isHaveLast\":\"Y\"}}}";

    String s1 = "啦啦";
    String s2 = "[]";
    String s3 = "{}";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainf);


        Log.i(TAG, "onCreate: " + s1.toString().length() + "***" + s1.toString());
        Log.i(TAG, "onCreate1: " + s2.toString().length() + "***" + s2.toString());
        Log.i(TAG, "onCreate2: " + s3.toString().length() + "***" + s3.toString());
        Log.i(TAG, "onCreate1: ");
        try {
            JSONObject o1 = new JSONObject(s1);
            JSONObject o2 = new JSONObject(s2);
            JSONObject o3 = new JSONObject(s3);
            Log.i(TAG, "onCreate2: ");
//            Log.i(TAG, "o1: " + o1.toString().length() + "******" + o1.toString() );
//            Log.i(TAG, "o2: " + o2.toString().length() + "******" + o2.toString() );
//            Log.i(TAG, "o3: " + o3.toString().length() + "******" + o3.toString() );

        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.i(TAG, "onCreate: " + "sfkslfjksj");
        try {
            JSONObject object = new JSONObject(str);
            JSONArray array = object.getJSONObject("RESULT").getJSONArray("examPie");
            Log.i(TAG, "1: " + array.toString().length() + "****" + array.toString());

            JSONObject obj1 = new JSONObject(str2);
            JSONArray array1 = obj1.getJSONObject("RESULT").getJSONArray("examPie");
            // 2: 2****[]
            Log.i(TAG, "2: " + array1.toString().length() + "****" + array1.toString());
            JSONObject obj2 = obj1.getJSONObject("RESULT").getJSONObject("examResult");
            // 3: {}***2
            Log.i(TAG, "3: " + obj2.toString() + "***" + obj2.toString().length());
            //4: 2****{}
            Log.i(TAG, "4: " + obj1.getJSONObject("RESULT").get("examResult").toString().length() + "****" + obj1.getJSONObject("RESULT").get("examResult").toString());
//            Log.i(TAG, "object : ***" + object.toString());
//            JSONObject objResult = object.getJSONObject("RESULT");
//            Log.i(TAG, "objResult:" + objResult.toString());
//            JSONObject objExam = objResult.getJSONObject("examResult");
//            Log.i(TAG, "3:" + objResult.isNull("examResult"));
//
//            JSONArray array = objResult.getJSONArray("examPie");
//            Log.i(TAG, "4: " + array.length() + "***" + array.toString() + "****" + array.toString().length() );
//            Log.i(TAG, "5: " + (array.length() > 1 ? 0:1));

        } catch (Exception e) {
            e.printStackTrace();
        }
//        JSONObject object = new JSONObject();
//        JSONObject object1 = new JSONObject();
//        JSONObject object2 = new JSONObject();
//        Log.i(TAG, "onCreate: skskfjsk");
//        try {
//            object.put("aaa","123");
//            object.put("bbb","234");
//            object1.put("ccc","333");
//            object2.put("cdd","");
//            object2.put("cd",null);
//
//
//            Log.i(TAG, "object: " + object.toString() + "----" + object.toString().length());
////            Log.i(TAG, "************************************ " );
////            Log.i(TAG, "1: " + object1.toString() + "----" + object1.toString().length());
////            Log.i(TAG, "2: " + object2.toString() + "----" + object2.toString().length());
////            Log.i(TAG, "onCreate: "  + object2.get("cd"));
////            object.isNull()
//
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
    }

    public void aaa(View view) {
//        startActivity(new Intent(MainActivityF.this,MainActivity.class));
    }
}
