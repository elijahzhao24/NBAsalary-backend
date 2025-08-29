package com.elijahzhao24.NBAsalary_backend.player;

import com.elijahzhao24.NBAsalary_backend.player.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    // Query players by team code, ordered by salary ascending
    // SELECT p.*
    // FROM players p
    // WHERE p.team = ?
    // ORDER BY p.salary ASC;
    List<Player> findByTeamOrderBySalaryAsc(String teamCode);

    // Alternatively, by Team entity
    // SELECT p.*
    // FROM players p
    // JOIN teams t ON p.team_id = t.id
    // WHERE t.code = ?
    // ORDER BY p.salary ASC;
    List<Player> findByTeamEntity_CodeOrderBySalaryAsc(String teamCode);

}
