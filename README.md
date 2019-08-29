This program is designed to help arrange the work at a bubble tea shop.

The final goal is that the manager of the store input the available time of every worker, 
and generate the arrangement table randomly with following specifications:
1. There are two kinds of workers: full-time (F) and part-time (P). F workers should work at least 5 days per week, P 
  workers should work at least 3 days per week.

2. Not every worker has the ability to open, close the store and check out.

3. The arrangement should be random in case one worker do a same kind of work in the week.

4. There are four types of work, which is kitchen, shake, order and long. In the table that finally exported, their background colur should be yellow, blue, green and pink.

5. The first kitchen worker should open the store and come to store at 10:45.

6. Every night there should be one worker who can check out, and one who can close the store. They need half an hour to do cleaning after the store is closed.

7. The types of works that required is as follows:
    1.For weekdays from Mon to Thu:

    <table>
      <tr>
        <td rowspan="2"></td>
        <td colspan="3">Day of the week</td>
      </tr>
      <tr>
        <td colspan="3">Dtae</td>
      </tr>
      <tr>
        <td> 12-18 </td>
        <td> Kitchen XX </td>
        <td> Shake XX </td>
        <td> Order XX </td>
      </tr>
      <tr>
        <td> 15-21 </td>
        <td colspan="3">Long XX </td>
      </tr>
      <tr>
        <td> 18-23 </td>
        <td> Kitchen XX </td>
        <td> Shake XX </td>
        <td> Order XX </td>
      </tr>
    </table>

    2.For Fri:

    <table>
      <tr>
        <td rowspan="2"></td>
        <td colspan="3">Day of the week</td>
      </tr>
      <tr>
        <td colspan="3">Dtae</td>
      </tr>
      <tr>
        <td> 12-18 </td>
        <td> Kitchen XX </td>
        <td> Shake XX </td>
        <td> Order XX </td>
      </tr>
      <tr>
        <td> 14-19 </td>
        <td colspan="3">Long XX </td>
      </tr>
      <tr>
        <td> 18-23 </td>
        <td colspan="3">Long XX </td>
      </tr>
      <tr>
        <td> 18-24 </td>
        <td> Kitchen XX </td>
        <td> Shake XX </td>
        <td> Order XX </td>
      </tr>
    </table>

    3.For Sat:

    <table>
      <tr>
        <td rowspan="2"></td>
        <td colspan="3">Day of the week</td>
      </tr>
      <tr>
        <td colspan="3">Dtae</td>
      </tr>
      <tr>
        <td> 12-18 </td>
        <td> Kitchen XX </td>
        <td> Shake XX </td>
        <td> Order XX </td>
      </tr>
      <tr>
        <td> 14-20 </td>
        <td colspan="3">Long XX </td>
      </tr>
      <tr>
        <td> 16-23 </td>
        <td colspan="3">Long XX </td>
      </tr>
      <tr>
        <td> 18-24 </td>
        <td> Kitchen XX </td>
        <td> Shake XX </td>
        <td> Order XX </td>
      </tr>
    </table>

    4.For Sun:

    <table>
      <tr>
        <td rowspan="2"></td>
        <td colspan="3">Day of the week</td>
      </tr>
      <tr>
        <td colspan="3">Dtae</td>
      </tr>
      <tr>
        <td> 12-18 </td>
        <td> Kitchen XX </td>
        <td> Shake XX </td>
        <td> Order XX </td>
      </tr>
      <tr>
        <td> 14-20 </td>
        <td colspan="3">Long XX </td>
      </tr>
      <tr>
        <td> 18-23 </td>
        <td> Kitchen XX </td>
        <td> Shake XX </td>
        <td> Order XX </td>
      </tr>
    </table>

8. Try to avoid that the work who closes the store and then open the store on the next day.
9. .........

