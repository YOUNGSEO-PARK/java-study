package com.bit2020.chapter03.tv;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

	public void power(boolean on) {
		power = on;
	}
	
	public void channel(int channel) {
		this.channel = channel;
		
		if(this.channel < 1) {
			this.channel += 255;
		} else if( this.channel > 255) {
			this.channel -= 255;
		}
	}
	
	public void channel(boolean up) {
		//증감 후 channel(int channel) 함수에서 범위 검증
		channel(channel + (up ? 1 : -1));
	}
	
	public void volume(int volume) {
		this.volume = volume;
			
		if(this.volume < 0) {
			this.volume += 100;
		} else if( this.volume > 100) {
			this.volume -= 100;
		}
	}
	
	public void volume(boolean up) {
		//증감 후 volume(int volume) 함수에서 범위 검증
		volume(volume + (up ? 1 : -1));
	}
	
	public void status() {
		System.out.println("TV[power="+power+", channel="+channel+", volume="+volume+"]");
	}

	


	
}
