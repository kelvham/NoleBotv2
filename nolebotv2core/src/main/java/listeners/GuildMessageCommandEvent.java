package listeners;

import commands.util.CommandEvent;
import lombok.Getter;
import lombok.Setter;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import util.settings.Settings;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class GuildMessageCommandEvent extends CommandEvent {
    private final List<String>   messageContent;
    private final GuildMessageReceivedEvent event;

    public GuildMessageCommandEvent(GuildMessageReceivedEvent event, List<String> message, Settings settings) {
        this.event          = event;
        this.messageContent = new ArrayList<>(message);

        this.setChannel(event.getChannel());
        this.setGuild(event.getGuild());
        this.setGuildId(event.getGuild().getId());
        this.setSettings(settings);
    }
}
