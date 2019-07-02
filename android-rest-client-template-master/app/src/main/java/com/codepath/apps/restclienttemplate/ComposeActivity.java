package com.codepath.apps.restclienttemplate;

/**
public class ComposeActivity extends AppCompatActivity {
    EditText etTweetInput;
    Button btnSend;
    TwitterClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose);

        etTweetInput = findViewById(R.id.etTweetInput);
        btnSend = findViewById(R.id.btnsend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendTweet();
            }
        });

    }

    client = TwitterApp.getRestClient(this);

    private void sendTweet() {
        client.sendTweet(etTweetInput.getText().toString(), new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (statusCode == 200) {
                    try {
                        JSONObject responseJson = new JSONObject(new String(responseBody));
                        Tweet result resultTweet = Tweet;
                    }
                }
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

            }
        });
    }
} */
