package plugin.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import plugin.mapper.data.PlayerScore;

@Mapper
public interface PlayerScoreMapper {
  @Select("SELECT * FROM player_score")
  List<PlayerScore> selectList();

  @Insert("insert into player_score (player_name, score, difficulty, registered_at) values (#{playerName}, #{score}, #{difficulty}, now())")
  int insert(PlayerScore playerScore);
}
