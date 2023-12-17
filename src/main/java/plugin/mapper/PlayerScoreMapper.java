package plugin.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import plugin.mapper.data.PlayerScore;

@Mapper
public interface PlayerScoreMapper {
  @Select("SELECT * FROM player_score")
  List<PlayerScore> selectList();
}
