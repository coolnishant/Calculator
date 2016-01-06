package me.nis.calculator;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements
		View.OnClickListener {
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, badd, bsub, bdiv, bmul,
			bdec, bclr, bdel, beql;
	TextView tVinput, tVme;
	String input = "", jnput = "";
	float n1 = 0, n2 = 0;
	char op = 'e';
	boolean y = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initialize();
		
		try {
			b1.setOnClickListener(this);
			b2.setOnClickListener(this);
			b3.setOnClickListener(this);
			b4.setOnClickListener(this);
			b5.setOnClickListener(this);
			b6.setOnClickListener(this);
			b7.setOnClickListener(this);
			b8.setOnClickListener(this);
			b9.setOnClickListener(this);
			b0.setOnClickListener(this);
			badd.setOnClickListener(this);
			bsub.setOnClickListener(this);
			bdel.setOnClickListener(this);
			bdec.setOnClickListener(this);
			bmul.setOnClickListener(this);
			bdiv.setOnClickListener(this);
			bclr.setOnClickListener(this);
			beql.setOnClickListener(this);
		}
		catch (Exception e) {
			
		}
	}

	private void initialize() {
		// TODO Auto-generated method stub
		tVinput = (TextView) findViewById(R.id.tVinput);
		tVme = (TextView) findViewById(R.id.tVme);
		b1 = (Button) findViewById(R.id.b1);
		b2 = (Button) findViewById(R.id.b2);
		b3 = (Button) findViewById(R.id.b3);
		b4 = (Button) findViewById(R.id.b4);
		b5 = (Button) findViewById(R.id.b5);
		b6 = (Button) findViewById(R.id.b6);
		b7 = (Button) findViewById(R.id.b7);
		b8 = (Button) findViewById(R.id.b8);
		b9 = (Button) findViewById(R.id.b9);
		b0 = (Button) findViewById(R.id.b0);
		badd = (Button) findViewById(R.id.badd);
		bsub = (Button) findViewById(R.id.bsub);
		bdiv = (Button) findViewById(R.id.bdiv);
		bmul = (Button) findViewById(R.id.bmul);
		bdec = (Button) findViewById(R.id.bdec);
		bdel = (Button) findViewById(R.id.bdel);
		bclr = (Button) findViewById(R.id.bclr);
		beql = (Button) findViewById(R.id.beql);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.coolmenu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch(item.getItemId()){
		case R.id.abt:
			Intent openStartingPoint = new Intent("me.cal.ABOUTME");
			startActivity(openStartingPoint);
			break;
		case R.id.pref:
			Toast.makeText( getApplicationContext(), "Nish is working on it!!!!", Toast.LENGTH_SHORT).show();
			break;
		}
		return false;
	}
	public void onClick(View v) {
		// TODO Auto-generated method stub
		input = tVinput.getText().toString();
		if (input.contentEquals("0")||input.contentEquals("error")) {
			{
				valueZero();
			}
		}
		int l=input.length()-1;
		int l2=jnput.length()-1;
		Random craz = new Random();
		tVme.setTextColor(Color.rgb(craz.nextInt(265), 265, craz.nextInt(265)));
		try{
		switch (v.getId()) {
		
		case R.id.b0:
			if(y==true)
			{
				valueZero();
				y=false;
			}
			input+='0';
			if(n2==0)
				jnput+="0";
			tVinput.setText(input);
			break;
			
		case R.id.b1:
			if(y==true)
			{
				valueZero();
				y=false;
			}
			input+='1';
			if(n2==0)
				jnput+="1";
			tVinput.setText(input);
			break;
		
		case R.id.b2:
			if(y==true)
			{
				valueZero();
				y=false;
			}
			input+="2";
			if(n2==0)
				jnput+="2";
			tVinput.setText(input);
			break;
		
		case R.id.b3:
			if(y==true)
			{
				valueZero();
				y=false;
			}
			input+="3";
			if(n2==0)
				jnput+="3";
			tVinput.setText(input);
			break;
		
		case R.id.b4:
			if(y==true)
			{
				valueZero();
				y=false;
			}
			input+="4";
			if(n2==0)
				jnput+="4";
			tVinput.setText(input);
			break;
		
		case R.id.b5:
			if(y==true)
			{
				valueZero();
				y=false;
			}
			input+="5";
			if(n2==0)
				jnput+="5";
			tVinput.setText(input);
			break;
		
		case R.id.b6:
			if(y==true)
			{
				valueZero();
				y=false;
			}
			input+="6";
			if(n2==0)
				jnput+="6";
			tVinput.setText(input);
			break;
		
		case R.id.b7:
			if(y==true)
			{
				valueZero();
				y=false;
			}
			input+="7";
			if(n2==0)
				jnput+="7";
			tVinput.setText(input);
			break;
		
		case R.id.b8:
			if(y==true)
			{
				valueZero();
				y=false;
			}
			if(n2==0)
				jnput+="8";
			input+="8";
			tVinput.setText(input);
			break;
		case R.id.b9:
			if(y==true)
				{
					valueZero();
					y=false;
				}
			input+="9";
			if(n2==0)
				jnput+="9";
			tVinput.setText(input);
			break;
		
		case R.id.bdec:
			if((jnput=="" && input.indexOf('.')!=-1)||jnput.indexOf('.')!=-1)
			{
				Toast.makeText( getApplicationContext(), "Error!!!!", Toast.LENGTH_SHORT).show();
				break;
			}
			
			if(y==true)
				{
					valueZero();
					y=false;
				}
			if(l!=0 && l!=-1)
			{
				if(input.charAt(l)=='+'||input.charAt(l)=='-'||input.charAt(l)=='/'||input.charAt(l)=='*')
				{
					input +="0";
				}
			}
			if(op=='e'&& l==-1)
			{
				input+="0";
			}
			input+=".";
			if(n2==0)
			{
				jnput+=".";
			}
			tVinput.setText(input);
			break;
		
		case R.id.badd:
			if(n1!=0 && y==false)
				n2=Float.parseFloat(jnput);
			else
				n1=Float.parseFloat(input);
			
			if(input.charAt(l)=='+'||input.charAt(l)=='-'||input.charAt(l)=='/'||input.charAt(l)=='*')
				{
					op='+';
					input = input.substring(0, input.length() - 1);
				}
			else if(input.charAt(l)=='.')
				input+="0";
			if(op=='e')
				op='+';
			if(n2!=0 && (!jnput.contentEquals("")))
				{
					n1=calculate(op);
					input=String.valueOf(n1);
					op='+';
				}
			n2=0;
			tVinput.setText(input + "+");
			tVinput.setTextColor(Color.BLACK);
			jnput="";
			y=false;
			break;
		
		case R.id.bsub:
			if(n1!=0 && y==false)
				n2=Float.parseFloat(jnput);
			else
				n1=Float.parseFloat(input);
			
			if(input.charAt(l)=='+'||input.charAt(l)=='-'||input.charAt(l)=='/'||input.charAt(l)=='*')
			{
				input = input.substring(0, input.length() - 1);
				op='-';
			}
			else if(input.charAt(l)=='.')
				input+="0";
			if(op=='e')
				op='-';
			if(n2!=0 && !jnput.contentEquals(""))
			{
				n1=calculate(op);
				input=String.valueOf(n1);
				op='-';
			}
			n2=0;
			tVinput.setText(input + "-");
			tVinput.setTextColor(Color.rgb(122, 122, 100));
			jnput="";
			y=false;
			break;
			
		case R.id.bdiv:
			if(n1!=0 && y==false)
				n2=Float.parseFloat(jnput);
			else
				n1=Float.parseFloat(input);
			if(input.charAt(l)=='+'||input.charAt(l)=='-'||input.charAt(l)=='/'||input.charAt(l)=='*')
			{
				op='/';
				input = input.substring(0, input.length() - 1);
			}
			else if(input.charAt(l)=='.')
				input+="0";
			if(op=='e')
				op='/';
			if(n2!=0 && !jnput.contentEquals(""))
			{
				n1=calculate(op);
				input=String.valueOf(n1);
				op='/';
			}
			n2=0;
			tVinput.setText(input + "/");
			tVinput.setTextColor(Color.BLUE);
			jnput="";
			y=false;
			break;
			
		case R.id.bmul:
			if(n1!=0 && y==false)
				n2=Float.parseFloat(jnput);
			else
				n1=Float.parseFloat(input);
			if(input.charAt(l)=='+'||input.charAt(l)=='-'||input.charAt(l)=='/'||input.charAt(l)=='*')
			{
				op='*';
				input = input.substring(0, input.length() - 1);
			}
			else if(input.charAt(l)=='.')
				input+="0";
			
			if(op=='e')
				op='*';
			
			if(n2!=0 && !jnput.contentEquals(""))
			{
				n1=calculate(op);
				input=String.valueOf(n1);
				op='*';
			}
			n2=0;
			tVinput.setText(input + "*");
			tVinput.setTextColor(Color.MAGENTA);
			jnput="";
			y=false;
			break;
		
		case R.id.bdel:
			if (input.length()>1) {
				if(!(input.charAt(input.length()-1)<'9'&&input.charAt(input.length()-1)>'0'))
					op='e';
					input = input.substring(0, input.length() - 1);
				if(jnput.length()>0)
					jnput = jnput.substring(0, jnput.length() - 1);
			} else
				{
					input = "0";
				}
			if(l2==0)
			{
				jnput="";
			}
			tVinput.setText(input);
			break;
			
		case R.id.bclr:
			valueZero();
			input="0";
			tVinput.setText(input);
			break;
		
		case R.id.beql:
			if(!jnput.contentEquals("")&&n1!=0)
				n2=Float.parseFloat(jnput);
			if(op!='e' && n1!=0)
			{
				
				float ans=calculate(op);
				n1=ans;
			}
			else
			{
				n1=Float.parseFloat(input);
			}
			n2=0;
			op='e';
			input=String.valueOf(n1);
			tVinput.setText(input);
			jnput="";
			y=true;
			break;
		}
		}
		catch(Exception e)
		{
			Toast.makeText( getApplicationContext(), "Error!!!!", Toast.LENGTH_LONG).show();
		}
		if(input.length()>20)
		{
			tVinput.setText("error");
		}
	}

	private void valueZero() {
		// TODO Auto-generated method stub
		jnput="";input = "";
		n1=0;n2=0;
		op='e';
		y=false;
		tVinput.setTextColor(Color.RED);
	}

	private float calculate(char op) {
		// TODO Auto-generated method stub
		float ans = 0;
		switch(op)
		{
		case '+':
			ans=n1+n2;
			break;
		case '-':
			ans=n1-n2;
			break;
		case '/':
			ans=n1/n2;
			break;
		case '*':
			ans=n1*n2;
			break;
		}
		return ans;
	}
}
