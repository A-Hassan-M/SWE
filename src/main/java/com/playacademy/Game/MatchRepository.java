package com.playacademy.Game;

import javax.transaction.Transactional;

@Transactional
public interface MatchRepository extends QuestionBaseRepository<Match> { }
