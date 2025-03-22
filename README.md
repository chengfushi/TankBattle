# TankBattle

## 项目介绍
TankBattle 是一款使用 Java 语言编写的坦克大战游戏，采用面向对象设计。游戏包含经典玩法，如坦克移动、射击、爆炸效果和敌军。

## 功能特性
- **单人模式**：玩家与AI坦克对战，击败所有敌人获胜。
- **多人对战**（计划中）：支持局域网或在线对战。
- **游戏地图**：多种地形，如草地、墙体、河流等，影响坦克移动和射击。
- **音效与动画**：爆炸、射击等特效，提升游戏体验。
- **道具系统**（计划中）：增加护盾、加速、双发炮弹等道具。

## 技术栈
- **语言**：Java
- **图形库**：Java Swing / JavaFX（待定）
- **网络通信**（多人模式）：Socket / Netty（待定）
- **存档功能**：JSON / SQLite（待定）

## 运行环境
- JDK 17 及以上
- 适用于 Windows / macOS / Linux

## 安装与运行
1. 克隆仓库：
   ```sh
   git clone https://github.com/你的GitHub用户名/TankBattle.git
   cd TankBattle
   ```
2. 编译代码：
   ```sh
   javac -d bin src/com/tankbattle/*.java
   ```
3. 运行游戏：
   ```sh
   java -cp bin com.tankbattle.Main
   ```

## 贡献指南
欢迎对项目进行贡献！如果有任何建议或Bug反馈，请提交 Issue 或 Pull Request。

## 许可证
本项目采用 MIT 许可证，详情请见 [LICENSE](LICENSE) 文件。

---

**作者：** Chengfu Shi
**GitHub 仓库：** [TankBattle](https://github.com/chengfushi/TankBattle)
