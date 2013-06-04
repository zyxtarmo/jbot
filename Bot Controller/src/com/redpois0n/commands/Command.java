package com.redpois0n.commands;

import java.util.List;

import com.redpois0n.bot.Bot;


public abstract class Command {
	
	public void execute(String[] args, List<Bot> bots) throws Exception {
		this.execute(args, bots.toArray(new Bot[0]));
	}
	
	public abstract void execute(String[] args, Bot[] bots) throws Exception;
	
	public abstract String getUsage();
	
	public abstract String getExample();
	
	public abstract String getDescription();

}
